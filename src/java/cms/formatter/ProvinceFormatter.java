package cms.formatter;

import cms.model.Province;
import cms.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class ProvinceFormatter implements Formatter<Province> {

    private ProvinceService provinceService;
    @Autowired
    public ProvinceFormatter(ProvinceService provinceService){
        this.provinceService = provinceService;
    }
    @Override
    public Province parse(String s, Locale locale) throws ParseException {
        return provinceService.findById(Long.parseLong(s));
    }

    @Override
    public String print(Province province, Locale locale) {
        return "[" + province.getId() + ", " + province.getName() + "]";
    }
}
