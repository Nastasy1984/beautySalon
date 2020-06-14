package service;

import dto.AddressDto;
import dto.PositionDto;

import java.util.List;

public interface PositionService {
    PositionDto getPositionById(Long id);

    List<PositionDto> getAllPositions();

    PositionDto addPosition(PositionDto positionDto);

    PositionDto updatePosition(PositionDto positionDto);

    void deletePositionById(Long id);
}
