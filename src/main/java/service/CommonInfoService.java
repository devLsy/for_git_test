package service;

import lombok.RequiredArgsConstructor;
import mapper.CommonInfoMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CommonInfoService {

    private final CommonInfoMapper commonInfoMapper;

    public void selectCommonList() {
        commonInfoMapper.selectCommonList();
    }
}
