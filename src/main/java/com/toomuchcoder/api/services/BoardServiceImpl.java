package services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.toomuchcoder.api.repositories.BoardRepository;

/**
 * packageName: services
 * fileName        : BoardServiceImpl.java
 * author          : solyikwon
 * date            : 2022-05-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-08         solyikwon      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class BoardServiceImpl {
    private final BoardRepository repository;
}
