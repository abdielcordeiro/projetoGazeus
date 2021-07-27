package DataProvider;

import java.io.*;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = System.getProperty("user.dir") + "/configs/Configuration.properties";

	public ConfigFileReader() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties não encontrado em: " + propertyFilePath);
		}
	}

	public void gravarFileReader(String key, String value){
		try {
			BufferedReader reader = new BufferedReader(new FileReader(propertyFilePath));
			FileOutputStream writer = new FileOutputStream(propertyFilePath);
			try {
				properties.load(reader);
				properties.setProperty(key, value);
				properties.store(writer,"Configuracao");
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties não encontrado em: " + propertyFilePath);
		}
	}

	public String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if (reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException(
					"Caminho de configuração de relatório não especificado no arquivo Configuration.properties da chave:reportConfigPath");
	}

	public String getLanguageConfigPath() {
		String languageConfigPath = properties.getProperty("language");
		if (languageConfigPath != null)
			return languageConfigPath;
		else
			throw new RuntimeException(
					"Caminho de configuração de relatório não especificado no arquivo Configuration.properties da chave:language");
	}

	public String getLocaleConfigPath() {
		String localeConfigPath = properties.getProperty("locale");
		if (localeConfigPath != null)
			return localeConfigPath;
		else
			throw new RuntimeException(
					"Caminho de configuração de relatório não especificado no arquivo Configuration.properties da chave:locale");
	}

}