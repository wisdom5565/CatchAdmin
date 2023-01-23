package com.catchmind.admin.service;

import com.catchmind.admin.model.entity.Point;
import com.catchmind.admin.model.network.Header;
import com.catchmind.admin.model.network.request.PointRequest;
import com.catchmind.admin.model.network.response.PointResponse;
import com.catchmind.admin.repository.PointRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PointLogicService extends BaseService<PointRequest, PointResponse, Point> {
    private final PointRepository pointRepository;

   private PointResponse response(Point point) {
       PointResponse pointResponse = PointResponse.builder()
               .poList(point.getPoList())
               .poTot(point.getPoTot())
               .build();
       return pointResponse;
   }

    @Override
    public Header<PointResponse> create(Header<PointRequest> request) {
        return null;
    }

    @Override
    public Header<PointResponse> read(Long id) {
       return pointRepository.findByPrIdx(id).map(point -> response(point))
               .map(Header::OK).orElseGet(() -> Header.ERROR("회원 못찾음"));
    }

    @Override
    public Header<PointResponse> update(Header<PointRequest> request) {
        return null;
    }

    @Override
    public Header<PointResponse> delete(Long id) {
        return null;
    }
}
