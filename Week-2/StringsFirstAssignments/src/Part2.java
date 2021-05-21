public class Part2 {
    public String findSimpleGene(String dna,String startCodon, String stopCodon){
        int startPosition = dna.indexOf(startCodon);
        if(startPosition == -1){
            return "";
        }
        int endPosition = dna.indexOf(stopCodon,startPosition+3);
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
        String startCodon = "ATG";
        String stopCodon = "TAA";
        String dna = "AATAGTACCACTAAGGA";
        System.out.println("DNA Strand = " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene = " + gene);

        dna = "ATCATGAGGGACAACGGA";
        System.out.println("DNA Strand = " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene = " + gene);

        dna = "ATCGAATCGTCCCAAT";
        System.out.println("DNA Strand = " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene = " + gene);

        dna = "ATCATCATGGTGGTTTAAGAC";
        System.out.println("DNA Strand = " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene = " + gene);

        dna = "ATGCGCCATGGTAA";
        System.out.println("DNA Strand = " + dna);
        gene = findSimpleGene(dna,startCodon,stopCodon);
        System.out.println("Gene = " + gene);
    }
    public static void main(String[] args){
        Part2 p2=new Part2();
        p2.testFindSimpleGene();
    }
}
