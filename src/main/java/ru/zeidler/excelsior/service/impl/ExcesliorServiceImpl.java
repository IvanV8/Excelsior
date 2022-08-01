package ru.zeidler.excelsior.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zeidler.excelsior.dto.ExcelsiorDTO;
import ru.zeidler.excelsior.mapping.ExcelsiorMapping;
import ru.zeidler.excelsior.model.Excelsior;
import ru.zeidler.excelsior.repository.ExcelsiorRepository;
import ru.zeidler.excelsior.service.ExcesliorService;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ExcesliorServiceImpl implements ExcesliorService {

    @Autowired
    private ExcelsiorRepository excelsiorRepository;

    @Autowired
    private ExcelsiorMapping excelsiorMapping;

    @Override
    public List<ExcelsiorDTO> GetExceslior(Date day) {

        List<Excelsior> excelsiors = excelsiorRepository.findByPeriodIs(day);
        return excelsiorMapping.excelsiorDTO(excelsiors);
    }

    @Override
    public List<ExcelsiorDTO> GetExcelsior(String ticker, Date d1, Date d2) {
        List<Excelsior> excelsiors = excelsiorRepository.findByStock_TickerEqualsAndPeriodIsBetween(ticker, d1, d2);
        return excelsiorMapping.excelsiorDTO(excelsiors);

    }
}