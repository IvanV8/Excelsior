package ru.zeidler.excelsior.mapping;

import org.mapstruct.Mapper;
import ru.zeidler.excelsior.dto.ExcelsiorDTO;
import ru.zeidler.excelsior.dto.JournalDTO;
import ru.zeidler.excelsior.model.Excelsior;
import ru.zeidler.excelsior.model.Journal;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JournalMapping {

    public JournalDTO journalDTO(Journal journal);
    public List<JournalDTO> journalDTO(List<Journal> journalList);

    public Journal Journal(JournalDTO journalDTO);
}
