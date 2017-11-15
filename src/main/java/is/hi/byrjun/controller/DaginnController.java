package is.hi.byrjun.controller;

import is.hi.byrjun.model.Dagur;
import is.hi.byrjun.repository.DagurRepository;
import is.hi.byrjun.services.DaginnService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Ebba Þóra Hvannberg
 * @date september 2017 HBV501G Hugbúnaðarverkefni 1 Háskóli Íslands
 *
 * Tekur við skipunum frá vefviðmóti til að skrá nýjan kennara og birta lista af
 * kennurum
 */
@Controller
@RequestMapping("/demo") // Notice here that the Request Mapping is set at the Class level
public class DaginnController {

    // Tenging yfir í þjónustu klasa fyrir góðan daginn forritið 
    @Autowired
    DaginnService daginnService;

    // Tenging yfir í safn af kennurum 
    @Autowired
    DagurRepository dagurRep;

    /**
     * Býður sama notandanum góðan daginn
     *
     * @param model
     * @return vefsíðu sem býður notanda góðan daginn
     */
    @RequestMapping("/notandi")
    public String notandi(Model model) {
        model.addAttribute("nafn", "Ebba Þóra");
        return "demo/synaNotandi";
    }

    /**
     * Spyr hvað notandinn heitir
     *
     * @return vefsíða með spurningu
     */
    @RequestMapping("/spyrjaNotanda")
    public String spyrjaNotandi() {
        return "demo/hvadaNotandi";
    }

    /**
     * Tekur við nafni frá notanda og birtir Góðan daginn nafn ef nafnið er á
     * réttu sniði annars birtir það villumeldingu
     *
     * @param nafn Nafn á notanda
     * @param model Módel með attributum
     * @return vefsíðu sem birtir góðan daginn nafn 
     */
    @RequestMapping(value = "/hver", method = RequestMethod.POST)
    public String hver(@RequestParam(value = "nafn", required = false) 
            String nafn, ModelMap model) {

        if (daginnService.erNafnRett(nafn)) {
            Dagur k = new Dagur(nafn, 50, 50, 50);
            model.addAttribute("dagur", k);
            dagurRep.add(k);
            return "demo/synaDagur";
        } else {
            return "demo/rangtNafn";
        }
    }

    /**
     * Birtir lista af kennurum
     *
     * @param model módel fyrir samskipti við viðmót
     * @return vefsíðu með lista af kennurum
     */
    @RequestMapping(value = "/listiDaga", method = RequestMethod.GET)
    public String listiDaga(Model model) {
        ArrayList<Dagur> listi;
        listi = (ArrayList<Dagur>) dagurRep.getAll();
        model.addAttribute("dagar", listi);
        return "demo/allirDagar";
    }

}
