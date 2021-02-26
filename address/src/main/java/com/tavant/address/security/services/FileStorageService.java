package com.tavant.address.security.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.tavant.address.models.Address;
import com.tavant.address.models.FileDB;
import com.tavant.address.models.Root;
import com.tavant.address.repository.AddressRepository;
import com.tavant.address.repository.FileDBRepository;

@Service
public class FileStorageService {

	@Autowired
	private FileDBRepository fileDBRepository;
	@Autowired
	private AddressRepository addressRepository;
	String line = "";
	static RestTemplate restTemplate = new RestTemplate();

	public int store(MultipartFile file) throws IOException {
		
		int count = 0;
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
		String s = new String(FileDB.getData(), StandardCharsets.UTF_8);
		String[] line = s.split("\\n");
		for (String str : line) {
			String[] index = str.split(",");
			Address ad = new Address(index[0], index[1], index[2], index[3], index[4], index[5], index[6], index[7],
					index[8], index[9], index[10], index[11], index[12], index[13], index[14], index[15], index[16]);

			try {
				String value = ad.geteLoc().toString();
				RestTemplate restTemplate = new RestTemplate();
				System.out.println(value.getClass().getName());
				value = value.replaceAll("\\s", "");
				String url = String.format(
						"http://apis.mapmyindia.com/advancedmaps/v1/3g1yqpzftqwgs4djlscnnv2egstdav3o/place_detail?place_id=%s",
						value);
				Root root = restTemplate.getForObject(url, Root.class);
				System.out.println("after");
				if (root.getResponseCode() == 200 && root.getResults().size() > 0) {
					count++;
					addressRepository.save(ad);
					System.out.println(count);
				}
			} catch (RestClientException e) {
				// TODO Auto-generated catch block
				System.out.println("error");
				e.printStackTrace();
			}

		}
		return count;
	}

	public FileDB getFile(String id) {
		return fileDBRepository.findById(id).get();
	}

	public Stream<FileDB> getAllFiles() {
		return fileDBRepository.findAll().stream();
	}
}
