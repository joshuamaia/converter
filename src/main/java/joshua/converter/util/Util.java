package joshua.converter.util;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

public final class Util {

	public static final String converterClasseEmXml(Object object) {
		XStream xstream = new XStream();

		return xstream.toXML(object);
	}

	public static final Object converterXmlEmClasse(String xml) {
		XStream xstream = new XStream();

		return xstream.fromXML(xml);
	}

	public static final String converterClasseEmJson(Object object) {
		Gson gson = new Gson();

		return gson.toJson(object);
	}

	public static final Object converterJsonEmClasse(String json, Class typeClass) {
		Gson gson = new Gson();

		return gson.fromJson(json, typeClass);
	}

	public static final String converterXmlEmJson(String xml) {
		XStream xstream = new XStream();
		return converterClasseEmJson(xstream.fromXML(xml));
	}

	public static final String converterJsonEmXml(String json, Class typeClass) {
		Gson gson = new Gson();
		return converterClasseEmXml(gson.fromJson(json, typeClass));
	}

}
