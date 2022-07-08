package genetic.algorithm;

public class ScoredString implements Comparable<ScoredString>
{
    public String string;
    public int score;

    public ScoredString(String string, int score)
    {
        this.string = string;
        this.score = score;
    }

    @Override public int compareTo(ScoredString other)
    {
        return Integer.compare(other.score, this.score);
    }
}
