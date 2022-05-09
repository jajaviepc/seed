package models.json

import io.circe.Encoder
import io.circe.generic.extras.semiauto.deriveConfiguredEncoder
import models.Transaction

object SerDes extends CirceImplicits {

  implicit val transactionEncoder: Encoder[Transaction] = deriveConfiguredEncoder
}
