public class Part1 {
    public String findSimpleGene(String dna){
        int startPosition = dna.indexOf("ATG");
        if(startPosition == -1){
            return "";
        }
        int endPosition = dna.indexOf("TAA",startPosition+3);
        if(endPosition == -1){
            return "";
        }
        String possibleDNA = dna.substring(startPosition, endPosition+3);
        if(possibleDNA.length()%3==0){
            return possibleDNA;
        }
        else return "";
    }
    public void testFindSimpleGene() {
        String gene = "";
        String dna = "AATAGTACCACTAAGGA";
        System.out.println("DNA Strand = " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene = " + gene);

        dna = "ATCATGAGGGACAACGGA";
        System.out.println("DNA Strand = " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene = " + gene);

        dna = "ATCGAATCGTCCCAAT";
        System.out.println("DNA Strand = " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene = " + gene);

        dna = "ATCATCATGGTGGTTTAAGAC";
        System.out.println("DNA Strand = " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene = " + gene);

        dna = "ATGCGCCATGGTAA";
        System.out.println("DNA Strand = " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene = " + gene);
    }
    public static void main(String[] args){
        Part1 p1=new Part1();
        p1.testFindSimpleGene();
    }
}
