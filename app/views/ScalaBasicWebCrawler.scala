package views

import org.jsoup.Jsoup
import org.jsoup.nodes.{Document, Element}

import java.util.{ArrayList, Collections}
import scala.jdk.CollectionConverters._

object ScalaBasicWebCrawler {

  def resScalaBasicWebCrawler(): ModelCompanies = {
    val listGetWeb = new ArrayList[GetWeb]
    val url:String = "https://theinternship.io/"
    val doc: Document = Jsoup.connect(url).get()
    val esPartner = doc.getElementsByClass("partner").asScala
    for (ePartner: Element <- esPartner) {
      val getWeb = new GetWeb
      val srcLogo: String = ePartner.getElementsByTag("img").attr("abs:src")
      val textBox: String = ePartner.getElementsByClass("list-company").text()
      val textBoxLength: Int = 9999999 - textBox.length
      getWeb.setTextBoxLength(textBoxLength)
      getWeb.setSrcLogo(srcLogo)
      listGetWeb.add(getWeb)
    }
    Collections.sort(listGetWeb)
    val listModelLogo = new ArrayList[ModelLogo]
    for (varList <- listGetWeb.asScala) {
      val modelLogo = new ModelLogo
      modelLogo.setLogo(varList.getSrcLogo)
      listModelLogo.add(modelLogo)
    }
    val modelCompanies = new ModelCompanies()
    modelCompanies.setCompanies(listModelLogo)
    return modelCompanies
  }

  class GetWeb extends Comparable[GetWeb] {
    private var srcLogo: String = null
    private var textBoxLength: Integer = null

    def getSrcLogo: String = {
      return srcLogo
    }

    def setSrcLogo(srcLogo: String): Unit = {
      this.srcLogo = srcLogo
    }

    def getTextBoxLength: Integer = {
      return textBoxLength
    }

    def setTextBoxLength(textBoxLength: Integer): Unit = {
      this.textBoxLength = textBoxLength
    }

    override def compareTo(o: GetWeb): Int = {
      return this.getTextBoxLength.compareTo(o.getTextBoxLength)
    }
  }

  class ModelLogo {
    private var logo: String = null

    def setLogo(logo: String): Unit = {
      this.logo = logo
    }
  }

  class ModelCompanies {
    private var companies: ArrayList[ModelLogo] = null

    def getCompanies: ArrayList[ModelLogo] = {
      return companies
    }

    def setCompanies(companies: ArrayList[ModelLogo]): Unit = {
      this.companies = companies
    }
  }

}
