package actions;

import com.flash3388.flashlib.scheduling.ActionControl;
import com.flash3388.flashlib.scheduling.actions.ActionBase;
import subSystem.Gripper;

public class ConeOut extends ActionBase {
    private Gripper gripper;

    public ConeOut(Gripper gripper){
        this.gripper = gripper;

        requires(this.gripper);
    }

    @Override
    public void execute(ActionControl control){
        gripper.move();
    }

    @Override
    public void end(){
        gripper.stop();
    }
}
