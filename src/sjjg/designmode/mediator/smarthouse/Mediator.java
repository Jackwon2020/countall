package sjjg.designmode.mediator.smarthouse;

import main.designmode.mediator.smarthouse.Colleague;

public abstract class Mediator {
	//�����н��߶��󣬼��뵽������
	public abstract void Register(String colleagueName, Colleague colleague);

	//������Ϣ, �����ͬ�¶��󷢳�
	public abstract void GetMessage(int stateChange, String colleagueName);

	public abstract void SendMessage();
}