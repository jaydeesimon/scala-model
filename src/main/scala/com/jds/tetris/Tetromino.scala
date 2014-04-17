package com.jds.tetris

case class Blocklet(x: Int, y: Int)

trait Tetromino {
  def blocklets: Set[Blocklet]

  def isActiveBlocklet(x: Int, y: Int): Boolean = blocklets.contains((Blocklet(x, y)))
}

class IBlock extends Tetromino {
  def blocklets: Set[Blocklet] = {
    Set(
      Blocklet(1, 0),
      Blocklet(1, 1),
      Blocklet(1, 2),
      Blocklet(1, 3)
    )
  }
}

class JBlock extends Tetromino {
  def blocklets: Set[Blocklet] = {
    Set(
      Blocklet(2, 1),
      Blocklet(2, 2),
      Blocklet(2, 3),
      Blocklet(1, 3)
    )
  }
}

class LBlock extends Tetromino {
  def blocklets: Set[Blocklet] = {
    Set(
      Blocklet(1, 1),
      Blocklet(1, 2),
      Blocklet(1, 3),
      Blocklet(2, 3)
    )
  }
}

class OBlock extends Tetromino {
  def blocklets: Set[Blocklet] = {
    Set(
      Blocklet(1, 2),
      Blocklet(1, 3),
      Blocklet(2, 2),
      Blocklet(2, 3)
    )
  }
}

class SBlock extends Tetromino {
  def blocklets: Set[Blocklet] = {
    Set(
      Blocklet(0, 3),
      Blocklet(1, 2),
      Blocklet(1, 3),
      Blocklet(2, 2)
    )
  }
}

class TBlock extends Tetromino {
  def blocklets: Set[Blocklet] = {
    Set(
      Blocklet(1, 3),
      Blocklet(2, 2),
      Blocklet(2, 3),
      Blocklet(3, 3)
    )
  }
}

class ZBlock extends Tetromino {
  def blocklets: Set[Blocklet] = {
    Set(
      Blocklet(1, 2),
      Blocklet(2, 2),
      Blocklet(2, 3),
      Blocklet(3, 3)
    )
  }
}