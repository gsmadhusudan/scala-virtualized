
/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2007, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id: genprod.scala 9543 2007-01-02 16:51:29Z emir $

// generated by genprod on Wed Jan 03 13:31:53 CET 2007

package scala

import Predef._

object Product0 {
  def unapply(x: Product0): Some[Product0] = 
    Some(x)
}

/** Product0 is a cartesian product of 0 components 
 */
trait Product0 extends Product {

  /**
   *  The arity of this product.
   *  @return 0
   */
  override def arity = 0

  /**
   *  Returns the n-th projection of this product if 0&lt;=n&lt;arity,
   *  otherwise null.
   *
   *  @param n number of the projection to be returned 
   *  @return  same as _(n+1)
   *  @throws  IndexOutOfBoundsException
   */
  override def element(n: Int) = n match {
    case _ => throw new IndexOutOfBoundsException(n.toString())
  }

  
}
