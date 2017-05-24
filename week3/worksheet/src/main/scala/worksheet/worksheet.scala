def nth(element: Int, list: List[T]): T {
  if (list == nil) nil
  else
  element match {
    case 0 => list.head
    case _ => nth(element - 1, list.tail)
  }
}
