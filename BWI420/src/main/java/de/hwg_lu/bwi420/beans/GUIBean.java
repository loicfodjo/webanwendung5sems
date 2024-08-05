package de.hwg_lu.bwi420.beans;

public class GUIBean {

	public GUIBean() {
		
	}
	
	public String getHeadlineHtml() {
		String html = "";
		html += "<table><tr>\n";
		html += "	<td>\n";
		html += "		<h3>BWI420 Portal</h3>\n";
		html += "	</td>\n";
		html += "	<td>\n";
		html += "		<a href='https://www.hwg-lu.de'>\n";
		html += "			<img id='eswird' src='../img/eswird.jpg' title='HWG Ludwigshafen' />\n";
		html += "		</a>\n";
		html += "	</td>\n";
		html += "</tr></table>\n";
		return html;
	}

}
