package org.archiviststoolkit.importer.MARCXML;

import java.util.List;

import java.util.Vector;

import org.archiviststoolkit.model.ArchDescriptionNotes;
import org.archiviststoolkit.model.Resources;
import org.archiviststoolkit.model.UnsupportedRepeatingDataTypeException;
import org.archiviststoolkit.structure.MARCXML.DataFieldType;
import org.archiviststoolkit.structure.NotesEtcTypes;
import org.archiviststoolkit.util.NoteEtcTypesUtils;
import org.archiviststoolkit.swing.InfiniteProgressPanel;

public class Handle514Action implements MARCXMLAction
{
    public void processElement(Resources resource, Object o, InfiniteProgressPanel progressPanel) throws UnsupportedRepeatingDataTypeException {
		DataFieldType dataField = (DataFieldType) o;
		String titles[] = {"z","a","b","c","d","e","f","g","h","i","j","k","m","u"};
		Vector <String> titlesV;
		titlesV = MARCIngest.arrayToVector(titles);
		NotesEtcTypes noteType = NoteEtcTypesUtils.lookupNoteEtcTypeByCannonicalName("General note");
		String noteTitle = "Data Quality";
		String title = MARCIngest.getSpecificSubCodeValuesAsDelimitedString(dataField,titlesV,",");
		ArchDescriptionNotes adn = new ArchDescriptionNotes(resource,noteTitle,NotesEtcTypes.DATA_TYPE_NOTE,resource.getRepeatingData().size()+1,noteType,title);
        adn.setPersistentId(resource.getNextPersistentIdAndIncrement());
		resource.addRepeatingData(adn);
	}
    public List getChildren(Object element)
    {
        return null;
    }
}