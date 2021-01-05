package ru.imatveev.weather.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ru.imatveev.weather.enums.Mode;
import ru.imatveev.weather.enums.Units;

import java.util.Locale;

@Configuration
public class ConverterConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(
                String.class,
                Mode.class,
                str -> {
                    switch (str.toLowerCase(Locale.ROOT)) {
                        case "xml":
                            return Mode.XML;
                        case "json":
                            return Mode.JSON;
                        case "html":
                            return Mode.HTML;
                        default:
                            return null;
                    }
                }
        );
        registry.addConverter(
                String.class,
                Units.class,
                str -> {
                    switch (str.toLowerCase(Locale.ROOT)) {
                        case "imperial":
                            return Units.IMPERIAL;
                        case "metric":
                            return Units.METRIC;
                        default:
                            return null;
                    }
                }
        );
    }
}
