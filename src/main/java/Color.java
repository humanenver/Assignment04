
    public class Color {

        private String color;
        private boolean primaryColor;


        public String getColor() {
            return color;
        }

        public Color(String color, boolean primaryColor) {
            this.color = color;
            this.primaryColor = primaryColor;
        }

        public void setColor(String color) {

            this.color = color;
        }

        public boolean isPrimaryColor() {
            return primaryColor;
        }

        public void setPrimaryColor(boolean primaryColor) {
            this.primaryColor = primaryColor;
        }


        @Override
        public String toString() {
            return getColor();
        }

        @Override
        public boolean equals(Object obj) {
            return this.color == ((Color)obj).color;
        }
        @Override
        public int hashCode()
        {
            return toString().hashCode();
        }

    }



