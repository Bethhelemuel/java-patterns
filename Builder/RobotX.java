package Patterns.Builder;

public class RobotX implements  Builder {

        private Robot robot;


        public RobotX(){

            robot= new Robot();
        }

    @Override
    public void buildHead() {

            robot.setRobotHead("Robot X metalic head");
    }

    @Override
    public void buildTorso() {
            robot.setRobotTorso("Robot X gold Torso");
    }

    @Override
    public void buildLegs() {
            robot.setRobotLegs("Robot X platinum legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
