package com.apiece.springboot_sns_sample.domain.recommand;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RecommendService {

    private static final List<Long> DEMO_CANDIDATES = List.of(101L, 102L, 103L, 104L, 105L);
    private final RecommendClient recommandClient;

    public List<Long> recommend(Long userId) {
        log.info("[STEP 2] 추천 서비스 호출");
        return recommandClient.rank(userId, DEMO_CANDIDATES);
    }
}
