package com.javaman.obsever;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengzhe
 * @date 2018/10/21 14:42
 * @description
 */

public abstract class Subject {

    private List<Obsever> obseverList = new ArrayList<>();

    public void addObsever(Obsever obsever) {
        obseverList.add(obsever);
    }

    public void deleteObsever(Obsever obsever) {
        obseverList.remove(obsever);
    }

    public void notifyObsevers() {
        for (Obsever obsever : obseverList) {
            obsever.update();
        }
    }

}
