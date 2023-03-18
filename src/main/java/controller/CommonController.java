package controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CommonInfoService;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "common/*")
public class CommonController {

    private final CommonInfoService commonInfoService;
    
    /**
     * 테스트  
     * @return
     */
    @GetMapping(value = "list")
    public Object list() {
        commonInfoService.selectCommonList();
        log.info("굿");
        return "success";
    }
}
