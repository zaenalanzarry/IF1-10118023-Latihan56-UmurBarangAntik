/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan56;

/**
 *
 * @author Zaenal PC
 */
public class Radio extends BarangAntik{
    private String name;

    public Radio(int umur) {
        super(umur);
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
