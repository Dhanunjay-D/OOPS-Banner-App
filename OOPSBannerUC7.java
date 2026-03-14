public class OOPSBannerUC7 {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "     *",
                "     *",
                " *****"
        });

        CharacterPattern[] word = {O, O, P, S};

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}