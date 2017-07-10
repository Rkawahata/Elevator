class DoorMotor{
	void DoorMotor(int x){
		if (x==1) {
			System.out.println("ドアを開く");
		}else if (x==2) {
			System.out.println("ドアを閉める");
		}else {
			System.out.println("エラー");
		}
	}
}

class GondolaMotor{
	void GondolaMotor(int y){
		if (y==1) {
			System.out.println("上昇開始");
		}else if (y==2) {
			System.out.println("下降開始");
		}else if (y==3) {
			System.out.println("停止");
		}else{
			System.out.println("エラー");
		}
	}
}