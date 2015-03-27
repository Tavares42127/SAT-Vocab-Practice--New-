public class Reader
{
    public static void main(String[] args)
    {
        List<User> list = new ArrayList<User>();
        File file = new File("test.txt");
        BufferedReader reader = null;
        try
        {
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] splitedString = line.split("|");
                Word word = new Word();
                word.setName(splitedString[0]);
                word.setScore(Integer.parseInt(splitedString[1]));
                list.add(word);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (reader != null)
            {
                try
                {
                    reader.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
        }

        for (Word word : list)
        {
            System.out.println(word.getWord()+" "+word.getDefinition());
        }
    }
}
