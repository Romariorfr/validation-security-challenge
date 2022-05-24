package com.devsuperior.bds04.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.bds04.dto.EventDTO;
import com.devsuperior.bds04.entities.Event;
import com.devsuperior.bds04.repositories.CityRepository;
import com.devsuperior.bds04.repositories.EventRepository;

@Service
public class EventService {

	@Autowired
	private EventRepository repository;

	@Autowired
	private CityRepository cityRepository;

	@Transactional
	public EventDTO insert(EventDTO dto) {
		Event entity = new Event();
		copyDTOToEntity(dto, entity);
		entity = repository.save(entity);
		return new EventDTO(entity);
	}

	@Transactional(readOnly = true)
	public Page<EventDTO> findAllPaged(Pageable pageable) {
		Page<Event> list = repository.findAll(pageable);
		return list.map(x -> new EventDTO(x));

	}

	private void copyDTOToEntity(EventDTO dto, Event entity) {
		entity.setName(dto.getName());
		entity.setUrl(dto.getUrl());
		entity.setDate(dto.getDate());
		entity.setCity(cityRepository.getOne(dto.getCityId()));

	}

}
