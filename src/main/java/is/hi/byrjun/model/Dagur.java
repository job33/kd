/*
 * Copyright (C) 2017 Ebba Þóra Hvannberg 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package is.hi.byrjun.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Ebba Þóra Hvannberg 
 * @date september 2017
 * HBV501G Hugbúnaðarverkefni 1
 * Háskóli Íslands
 * 
 * Kennari klasi inniheldur nafn kennarans og heimilisfang
 */
public class Dagur {
    private String nafn;
    private int protein;
    private int carb;
    private int fat;
    

    public String getNafn() {
        return nafn;
    }

    public void setNafn(String nafn) {
        this.nafn = nafn;
    }

    public int getProtein() {
        return protein;
    }

    public void setProtein(int protein) {
        this.protein = protein;
    }
    
    public int getCarb() {
        return carb;
    }

    public void setCarb(int carb) {
        this.carb = carb;
    }
    
    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }
   
    
    public Dagur (String n, int p, int c, int f) {
        nafn = n;
        protein = p;
        carb = c;
        fat = f;
    }
    
    @Override
    public String toString() {
        return String.format("<BR>" + "nafn: " + nafn + "<BR>" + "Prótein: " + protein + "<BR>" + "Carb: " + carb + "<BR>" + "Fat: " + fat);
    }
    
}
