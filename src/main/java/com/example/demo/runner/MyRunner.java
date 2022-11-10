package com.example.demo.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.constants.ApplicationConstants;
import com.example.demo.model.Hotel;
import com.example.demo.model.Rooms;

@Component
public class MyRunner implements ApplicationRunner {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		/*
		 * RequestEntity<Void> req =
		 * RequestEntity.get(ApplicationConstants.HOTEL_GET_ENDPOINT,101)
		 * .accept(MediaType.APPLICATION_JSON).build();
		 * 
		 * ResponseEntity<Hotel> res = restTemplate.exchange(req, Hotel.class); Hotel
		 * hotel = res.getBody();
		 * System.out.println(hotel.getId()+", "+hotel.getName()+", "+hotel.
		 * getDescription()+", "+hotel.getZipCode()+", "); hotel.getRooms().forEach(room
		 * -> System.out.println("Room : "+room.getId()+", "+room.getDisplayName()));
		 */
		Hotel hotelobj = new Hotel();
		hotelobj.setId(200);
		hotelobj.setName("Bliss Hotel");
		hotelobj.setZipCode(517645);
		hotelobj.setDescription("5-star-hotel");
		hotelobj.setActive(true);

		Rooms r1 = new Rooms();
		r1.setId(401);
		r1.setDisplayName("Beach front room");
		r1.setQuantity(10);
		r1.setPrice(10000.0);

		Rooms r2 = new Rooms();
		r2.setId(402);
		r2.setDisplayName("Suite Room");
		r2.setQuantity(15);
		r2.setPrice(9000.0);

		List<Rooms> lstrooms = Arrays.asList(r1, r2);
		hotelobj.setRooms(lstrooms);

		RequestEntity<Hotel> entity = RequestEntity.post(ApplicationConstants.HOTEL_POST_ENDPOINT)
				.contentType(MediaType.APPLICATION_JSON).body(hotelobj);
		ResponseEntity<String> re = restTemplate.exchange(entity, String.class);
		System.out.println(re.getBody());
	}

}
