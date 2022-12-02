using System;
using System.IO;

class TestDotNetC
{
    public static void Main(String[] args) {

    	long start = DateTime.Now.Ticks / TimeSpan.TicksPerMillisecond;

        for(int i = 0; i<100000; i++)
            using (var writer = File.AppendText("test-dotnetc.txt")) {
                writer.WriteLine(i+". dotNetCore is awesome");
            }

        long end = DateTime.Now.Ticks / TimeSpan.TicksPerMillisecond;

        Console.WriteLine((end-start)+"  milliseconds (python language)");
    }
}