package Shapes;

import java.awt.*;

public class Square extends Rect
{
    private Square(Point initPos, Color col, int size)
    {
        super(initPos, col, size, size);
    }
}
