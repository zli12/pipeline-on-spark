package batch

import java.lang.management.ManagementFactory
import org.apache.spark.{SparkContext, SparkConf}

object BatchJob {
  def main (args: Array[String]): Unit = {
    val conf = new SparkConf()
      .setAppName("Lambda with Spark")

    if (ManagementFactory.getRuntimeMXBean.getInputArguments.toString.contains("IntelliJ IDEA")) {
//      System.setProperty("hadoop.home.dir","")
        conf.setMaster("local[*]")
    }
  }
}
