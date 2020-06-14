package beautySalon.controller;

import beautySalon.dto.PositionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import beautySalon.service.PositionService;

import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.util.List;

@RequestMapping("/position")
@RestController
public class PositionController {
    PositionService positionService;

    @Autowired
    public PositionController(PositionService positionService){
        this.positionService = positionService;
    }


    @GetMapping(value = "/{id:\\d+}")
    public PositionDto getPositionById (@PathVariable("id") Long id){
        return positionService.getPositionById(id);
    }

    @GetMapping
    public List<PositionDto> getAllPositions (){
        return positionService.getAllPositions();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PositionDto addPosition (@Valid @RequestBody PositionDto positionDto){
        return positionService.addPosition(positionDto);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public PositionDto updateAddress (@Valid @RequestBody PositionDto positionDto){
        return positionService.updatePosition(positionDto);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deletePositionbyId (@PathParam("id") Long id){
        positionService.deletePositionById(id);
    }
}
