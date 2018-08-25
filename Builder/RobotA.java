package Patterns.Builder;

public class RobotA implements  Builder {

        private Robot robot;


        public RobotA(){

            robot= new Robot();
        }

    @Override
    public void buildHead() {

            robot.setRobotHead("Robot A head");
    }

    @Override
    public void buildTorso() {
            robot.setRobotTorso("Robot A Torso");
    }

    @Override
    public void buildLegs() {
            robot.setRobotLegs("Robot A Legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
