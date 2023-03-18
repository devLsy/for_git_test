package controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "common/*")
public class CommonController {

    /**
     * 테스트  
     * @return
     */
    @GetMapping(value = "list")
    public Object list() {
        return "";
    }
}
