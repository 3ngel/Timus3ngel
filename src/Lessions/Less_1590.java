package Lessions;

public class Less_1590 {
    private static void main(String[] args)
    {

    }

    private static int TakeMostLengthPrefixLength(String a, String b)
    {
        int len = 0;
        for (int i = 0; i < a.length() && i < b.length(); i++)
            if (a[i] == b[i]) {
                len++;
            } else
                break;

        return len;
    }

    private static int CalculateAllSubstrings(SortedSet<String> suffixes)
    {
        var previousSuffix = suffixes.First();
        var count = previousSuffix.Length;
        foreach (var suffix in suffixes.Skip(1))
        {
            count += suffix.Length - TakeMostLengthPrefixLength(previousSuffix, suffix);
            previousSuffix = suffix;
        }

        return count;
    }

    private static SortedSet<string> TakeSuffixes(string input)
    {
        var sortedSuffixes =new SortedSet<string>(StringComparer.Ordinal);
        for (int i = 0; i < input.Length; i++)
            sortedSuffixes.Add(input.Substring(i, input.Length - i));
        return sortedSuffixes;
    }
}
