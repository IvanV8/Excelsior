package ru.zeidler.excelsior.service.impl;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zeidler.excelsior.dto.JournalDTO;

import ru.zeidler.excelsior.mapping.JournalMapping;
import ru.zeidler.excelsior.repository.JournalRepository;
import ru.zeidler.excelsior.service.JournalService;

import java.util.Date;
import java.util.List;
@Service
@RequiredArgsConstructor
public class JournalServiceImpl implements JournalService {

    @Autowired
    private final JournalRepository journalRepositary;

    @Autowired
    private final JournalMapping journalMapping;

    @Override
    public List<JournalDTO> GetJournal(Long UserId, Date d1, Date d2) {
        return null;

    }
}
