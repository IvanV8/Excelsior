package ru.zeidler.excelsior.service;

import ru.zeidler.excelsior.dto.ExcelsiorDTO;
import ru.zeidler.excelsior.dto.JournalDTO;

import java.util.Date;
import java.util.List;


public interface JournalService {

      List<JournalDTO> GetJournal(Long UserId, Date d1, Date d2);
}

