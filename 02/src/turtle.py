'''Turtles.'''


class Turtle:
    '''Turtle.'''

    def __init__(self, name, stands_on=None):
        '''Init a new Turtle with the given name and the Turtle to stand on.
        '''

        self._name = name
        self._stands_on = stands_on

    def name(self):
        '''Return the name of this Turtle.'''

        return self._name

    def stands_on(self):
        '''Return the Turtle on which this Turtle stands.'''

        return self._stands_on

    def all_the_way_down(self):
        return TurtlesAllTheWayDownIterator(self)

    def _comparison(self, other_turtle):
        a = self._name
        b = other_turtle._name
        return (a > b) - (a < b)

    def __eq__(self, other_turtle):
        return self._comparison(other_turtle) == 0
    def __ne__(self, other_turtle):
        return self._comparison(other_turtle) != 0
    def __gt__(self, other_turtle):
        return self._comparison(other_turtle) > 0
    def __ge__(self, other_turtle):
        return self._comparison(other_turtle) >= 0
    def __lt__(self, other_turtle):
        return self._comparison(other_turtle) < 0
    def __le__(self, other_turtle):
        return self._comparison(other_turtle) <= 0

    def __iter__(self):
        return TurtleIterator(self)

    def __str__(self):
        return self._name


class TurtleIterator:
    '''Iterator over the Turtles.'''

    def __init__(self, turtle=None):
        self._curr_turtle = turtle

    def __iter__(self):
        return self

    def __next__(self):
        curr_turtle = self._curr_turtle
        if curr_turtle:
            self._curr_turtle = curr_turtle.stands_on()
            return curr_turtle
        else:
            raise StopIteration


class TurtlesAllTheWayDownIterator:
    '''It's turtles, all the way down!'''

    def __init__(self, turtle=None):
        self._iter = TurtleIterator(turtle)

    def __iter__(self):
        return self

    def __next__(self):
        try:
            return next(self._iter)
        except StopIteration:
            return Turtle("Another Turtle")


if __name__ == '__main__':
    '''Just some sample calls. Do not examine for presence of bugs in this
    part.
    '''

    # comparisons
    mr1 = Turtle('Mr.Turtle')
    mr2 = Turtle('Mr.Turtle')
    ms = Turtle('Ms.Turtle')
    print (mr1 < ms)
    print (mr1 == mr2)
    
    # iteration
    turtle = Turtle('T0', Turtle('T1', Turtle('T2')))
    print (turtle)
    for t in turtle:
        print(t, 'on', end=' ')
    print ('what?')

    # super iteration
    turtle = Turtle('T0', Turtle('T1', Turtle('T2')))
    print (turtle)
    for t in turtle.all_the_way_down():
        print(t, 'on', end=' ')
    print ('what?')
