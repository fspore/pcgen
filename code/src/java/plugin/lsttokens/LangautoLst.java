/*
 * Created on Sep 2, 2005
 *
 */
package plugin.lsttokens;

import java.util.StringTokenizer;

import pcgen.core.PObject;
import pcgen.persistence.lst.GlobalLstToken;

/**
 * @author djones4
 *
 */
public class LangautoLst implements GlobalLstToken {

	public String getTokenName() {
		return "LANGAUTO";
	}

	public boolean parse(PObject obj, String value, int anInt) {
		final StringTokenizer aTok = new StringTokenizer(value, ",");

		while (aTok.hasMoreTokens()) {
			obj.addLanguageAuto(value);
		}
		return true;
	}
}

