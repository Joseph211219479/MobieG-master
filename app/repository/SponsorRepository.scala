package repository

import org.h2.engine.Database
import repository.ChannelRepository.ChannelRepository

import scala.slick.driver.MySQLDriver.simple._
import scala.slick.lifted.ProvenShape

/**
 * Created by joseph on 2014/09/09.
 */
object SponsorRepository {

    class SponsorRepository(tag: Tag) extends Table[(String, String, String, String, String, String)](tag, "Sponsor"){

      def id = column[String]("SPONSOR_ID", O.PrimaryKey)

      def name = column[String]("SPONSOR_NAME")

      def url = column[String]("SPONSOR_URL")

      def message = column[String]("SPONSOR_MESSAGE")

      def imageID = column[String]("SPONSOR_IMAGEID")

      def channelID = column[String]("SPONSOR_CHANNELID")

      def sponsor = (id, name, url, message, imageID, channelID )


       def * = (id, name, url, message, imageID, channelID)


      def channel = foreignKey("CH_FK", channelID, TableQuery[ChannelRepository])(_.id)
    }

  val sponsor = TableQuery[SponsorRepository]

}
