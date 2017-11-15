/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package is.hi.byrjun.repository;

import is.hi.byrjun.model.Dagur;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ebba Þóra Hvannberg 
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 * 
 * Safn af kennurum 
 */
@Repository
public class DagurRepositoryImp implements DagurRepository{

    // Listi af kennurum 
    private final List<Dagur> dagar;

    public DagurRepositoryImp() {
        this.dagar = new ArrayList<Dagur>();
    }
    
    @Override
    public List<Dagur> getAll() {
        return dagar; 
    }

    @Override
    public void add (Dagur dagur) {
        dagar.add(dagur);
    }

}
