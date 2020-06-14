package service;

import dto.AddressDto;
import dto.PositionDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    @Override
    public PositionDto getPositionById(Long id){
        //TODO change
        PositionDto samplePositionDto = new PositionDto();
        samplePositionDto.setId(123l);
        samplePositionDto.setPosition("fgfds");
        return samplePositionDto;
    }

    @Override
    public List<PositionDto> getAllPositions(){
        //TODO change
        List <PositionDto> positionList = new ArrayList<>();
        PositionDto samplePositionDto = new PositionDto();
        samplePositionDto.setId(123l);
        samplePositionDto.setPosition("fgfds");
        positionList.add(samplePositionDto);
        return positionList;
    }

    @Override
    public PositionDto addPosition(PositionDto positionDto){
        //TODO change
        return positionDto;
    }

    @Override
    public PositionDto updatePosition(PositionDto positionDto){
        //TODO change
        return positionDto;
    }

    @Override
    public void deletePositionById(Long id){
        //TODO change
    }
}
