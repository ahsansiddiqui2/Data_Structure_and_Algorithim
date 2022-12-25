class Node:
    __slots__ = '_element','_next'
    def __init__(self,element,next):
        self._element = element
        self._next = next
    def __init__(self) -> None:
        self._head = None
        self._size = 0

    