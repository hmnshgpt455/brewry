package org.brewery.works.brewry.web.services;

import org.brewery.works.brewry.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
