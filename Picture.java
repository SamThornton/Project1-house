/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * The picture has been created as part of CISY242 at RVCC.
 * It shows a man and his giant robot companion. 
 * 
 * @author   Sam Thornton
 * @version  2017.09.18
 */
public class Picture
{
    private Square body;
    private Square head;
    private Triangle leftLeg;
    private Triangle rightLeg;
    private Circle leftEye;
    private Circle rightEye;
    private Triangle leftArm;
    private Triangle rightArm;
    private Person man;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        head = new Square();
        head.changeColor("black");
        head.moveHorizontal(-125);
        head.moveVertical(-65);
        head.changeSize(35);
        head.makeVisible();

        leftLeg = new Triangle();
        leftLeg.moveHorizontal(-60);
        leftLeg.moveVertical(60);
        leftLeg.makeVisible();
        
        rightLeg = new Triangle();
        rightLeg.moveHorizontal(40);
        rightLeg.moveVertical(60);
        rightLeg.makeVisible();
        
        rightArm = new Triangle();
        rightArm.moveHorizontal(52);
        rightArm.moveVertical(-40);
        rightArm.changeSize(100, 20);
        rightArm.makeVisible();
        
        leftArm = new Triangle();
        leftArm.moveHorizontal(-74);
        leftArm.moveVertical(-40);
        leftArm.changeSize(100, 20);
        leftArm.makeVisible();
        
        body = new Square();
        body.moveHorizontal(-170);
        body.moveVertical(-30);
        body.changeSize(120);
        body.makeVisible();

        leftEye = new Circle();
        leftEye.changeColor("yellow");
        leftEye.moveHorizontal(-40);
        leftEye.moveVertical(-33);
        leftEye.changeSize(8);
        leftEye.makeVisible();
        
        rightEye = new Circle();
        rightEye.changeColor("yellow");
        rightEye.moveHorizontal(-25);
        rightEye.moveVertical(-33);
        rightEye.changeSize(8);
        rightEye.makeVisible();
        
        man = new Person();
        man.changeColor("blue");
        man.moveVertical(40);
        
        man.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (body != null)   // only if it's painted already...
        {
            body.changeColor("black");
            head.changeColor("black");
            leftLeg.changeColor("black");
            rightLeg.changeColor("black");
            leftArm.changeColor("black");
            rightArm.changeColor("black");
            leftEye.changeColor("white");
            rightEye.changeColor("white");
            man.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (body != null)   // only if it's painted already...
        {
            head.changeColor("black");
            leftLeg.changeColor("green");
            rightLeg.changeColor("green");
            leftArm.changeColor("green");
            rightArm.changeColor("green");
            body.changeColor("red");
            leftEye.changeColor("yellow");
            rightEye.changeColor("yellow");
            man.changeColor("blue");
        }
    }
}
