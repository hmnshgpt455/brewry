package org.brewery.works.brewry.web.services;

import lombok.extern.slf4j.Slf4j;
import org.brewery.works.brewry.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j //Add logging to classes. From lombok
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //TODO - Impl implementation
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting beer for id : " + beerId);
    }
}
