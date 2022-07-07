package com.company;

public class GlassWindow {

        private String orientation;

        public void drawCurtains(int hour, int minutes) {
        System.out.println("Drawing curtains at " + hour + ":" + minutes);
        }

        public GlassWindow(String orientation) {
            this.orientation = orientation;

        }

        public void windowFacing(String orientation) {
            System.out.println("Window faces  " + orientation );
        }

        public String getOrientation() {
            return orientation;
        }


}
